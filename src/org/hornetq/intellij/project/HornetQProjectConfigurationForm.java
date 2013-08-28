package org.hornetq.intellij.project;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: andy
 * Date: 27/08/13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
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
      return false;
   }

   public JComponent getForm()
   {
      return hornetQProjectConfigPanel;
   }
}
