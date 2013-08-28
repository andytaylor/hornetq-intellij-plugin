package org.hornetq.intellij.project;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import javax.swing.*;

public class HornetQProjectConfigurationForm
{
   private JPanel hornetQProjectConfigPanel;
   private JLabel hornetQProjectConfiglabel;
   private TextFieldWithBrowseButton hornetQHome;


   public void setData(HornetQProjectComponent data)
   {
      hornetQHome.setText(data.getHornetQHome());
   }

   public void getData(HornetQProjectComponent data)
   {
      data.setHornetQHome(hornetQHome.getText());
   }

   public boolean isModified(HornetQProjectComponent data)
   {
      return hornetQHome.getText() != null && !hornetQHome.getText().equals("") ?
             ! hornetQHome.getText().equals(data.getHornetQHome()) :
             data.getHornetQHome() != null;
   }

   public JComponent getForm()
   {
      return hornetQProjectConfigPanel;
   }

   public TextFieldWithBrowseButton getHornetQHome()
   {
      return hornetQHome;
   }
}
