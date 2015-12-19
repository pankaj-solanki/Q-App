/**
 * 
 */
package com.qapp.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pankaj Solanki
 */
public class ServiceImplGenerator {

  private static final String OUTPUT_DIR = "src/main/java/com/qapp/service/impl/";

  private static final String TEMPLATE_FILE = "/com/qapp/generator/TemplateServiceImpl.java";

  private static final String[] modelNames =
      {"AnswerContent", "Answer", "ContentType", "Device", "DistributionList", "EventEntityType",
          "Event", "FriendGroup", "FriendGroupMember", "FriendNetwork", "QuestionContent",
          "Question", "QuestionSharing", "QuestionType", "SharingEntityType", "UserContact",
          "User", "UserStatus"};

  public static void main(String[] args) throws IOException {

    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      for (String name : modelNames) {
        br =
            new BufferedReader(new InputStreamReader(ServiceImplGenerator.class
                .getResourceAsStream(TEMPLATE_FILE)));
        bw = new BufferedWriter(new FileWriter(OUTPUT_DIR + name + "ServiceImpl.java"));
        while (br.ready()) {
          String line = br.readLine();
          String templateValue = Character.toLowerCase(name.charAt(0)) + name.substring(1);
          line = line.replaceAll("template", templateValue);
          line = line.replaceAll("Template", name);
          bw.write(line);
          bw.newLine();
        }

        br.close();
        bw.close();
      }
    } finally {
      if (br != null) {
        br.close();
      }
      if (bw != null) {
        bw.close();
      }
    }

  }

}
