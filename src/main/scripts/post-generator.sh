#!/bin/bash
CURDIR="$(pwd)"
SCRIPT_DIR=`dirname $0`
usage()
{
cat << EOF
usage: $0 options

This script is usefull to generate xml map to extend mybatis 
generator client interfaces. It suppose this structure:
<base>/sqlmap/           : generated xml mapper and interfaces
<base>/sqlmap/extended/  : extended xml mapper and interfaces
<base>/sqlmap/generated/ : copy of generated xml mapper changing
                           its namespace

If exist a mapper xml in <base>/sqlmap/extend identify by a name 
ending in Extended this script generate a copy of original generated
xml map of extended interface changing then namespace to reflect the 
extended Interface in <base>/sqlmap/generated.

This script require a list of base path:
$0 path1 path2 ...

Required parameters are marked by an *

OPTIONS:
  -h, --help          Show this message

EOF
}

declare -a BASES
let INDEX=0
TEMP=`getopt -o "hb:" --long "help,base:" -n "$0" -- "$@"`
eval set -- "$TEMP"
while true ; do
    case "$1" in
        -h|--help) 
            usage
            exit 1 ;;
        --) 
            shift ;
            break ;;
        *) 
            echo "Too mutch parametes!!! abort." ;
            exit 1 ;;
    esac
done
#process all paths
let INDEX=0
BASE="$1"
while [ "${BASE:0:1}" == "/" ]
do
    shift ;
    BASES[$INDEX]="$BASE"
    let INDEX+=1
    BASE="$1"
done
if [ "$INDEX" -le "0" ]
then
    echo "--bases options cannot be emplty"
    usage
    exit 1
fi

for BASE in ${BASES[@]}
do
    if [ ! -d "$BASE" ]
    then
        echo "Error: every base parameter must be a folder!!"
        echo "Base=$BASE is not a folder"
        usage
        exit 1
    fi
    SQLMAP="$BASE"
    if [ ! -d "$SQLMAP" ]
    then
        echo "Error: every base parameter must have a sqlmap folder!!"
        echo "$SQLMAP is not a folder"
        usage
        exit 1
    fi
    EXTENDED="$BASE/extended"
    if [ ! -d "$EXTENDED" ]
    then
        echo "Error: every base parameter must have a sqlmap/extended folder!!"
        echo "$EXTENDED is not a folder"
        usage
        exit 1
    fi
    GENERATED="$BASE/generated"
    if [ ! -d "$GENERATED" ]
    then
        mkdir -p "$GENERATED"
    fi
    while IFS= read -r -d '' file
    do
        name="${file##*/}" 
        #path="${file%/*}"
        ext=".${name##*.}"
        nameNoSuffix="${name%$ext}"
        nameBase="${nameNoSuffix%Extended}"
        sed -r 's/<mapper namespace="(.+)\.([^."]+)"\s*>\s*$/<mapper namespace="\1.extended.\2Extended">/' "$SQLMAP/$nameBase.xml" > "$GENERATED/$nameNoSuffix.xml"
    done < <(eval "find $EXTENDED/ -type f -name \*Extended\.xml -print0")

done
exit 0