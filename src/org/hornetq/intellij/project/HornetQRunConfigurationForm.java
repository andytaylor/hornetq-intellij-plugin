package org.hornetq.intellij.project;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import javax.swing.*;

public class HornetQRunConfigurationForm
{
   private JPanel hornetQrunPanel;
   private JLabel configLocationLabel;
   private TextFieldWithBrowseButton configLocation;

   public JComponent getRunPanel()
   {
      return hornetQrunPanel;
   }

   public void setData(HornetQSettingsEditor data)
   {
      configLocation.setText(data.getHQConfigFile());
   }

   public void getData(HornetQSettingsEditor data)
   {
      data.sethQConfigFile(configLocation.getText());
   }
}
