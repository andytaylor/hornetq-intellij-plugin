package org.hornetq.intellij.project;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: andy
 * Date: 27/08/13
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class HornetQProjectConfiguration
{
   private JPanel hornetQProjectConfigPanel;
   private JLabel hornetQProjectConfiglabel;
   private TextFieldWithBrowseButton hornetQHome;

   public void setData(HornetQProjectConfigurationForm data)
   {
   }

   public void getData(HornetQProjectConfigurationForm data)
   {
   }

   public boolean isModified(HornetQProjectConfigurationForm data)
   {
      return false;
   }
}
