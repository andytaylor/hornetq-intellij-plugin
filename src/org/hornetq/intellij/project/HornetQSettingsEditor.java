package org.hornetq.intellij.project;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

class HornetQSettingsEditor extends SettingsEditor
{
   private HornetQRunConfigurationForm form;
   private String hQConfigFile;

   private String testFileLocation;

   @Override
   protected void resetEditorFrom(Object o)
   {
      System.out.println("HornetQSettingsEditor.resetEditorFrom");
   }

   @Override
   protected void applyEditorTo(Object o) throws ConfigurationException
   {
      System.out.println("HornetQSettingsEditor.applyEditorTo");
   }

   @NotNull
   @Override
   protected JComponent createEditor()
   {
      if(form == null)
      {
         form = new HornetQRunConfigurationForm();
      }
      return form.getRunPanel();
   }

   @Override
   protected void disposeEditor()
   {
      form = null;
   }

   public String getHQConfigFile()
   {
      return hQConfigFile;
   }

   public void sethQConfigFile(final String hQConfigFile)
   {
      this.hQConfigFile = hQConfigFile;
   }

   public String getTestFileLocation()
   {
      return testFileLocation;
   }

   public void setTestFileLocation(final String testFileLocation)
   {
      this.testFileLocation = testFileLocation;
   }
}
