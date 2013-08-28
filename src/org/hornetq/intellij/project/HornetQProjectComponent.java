package org.hornetq.intellij.project;

import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: andy
 * Date: 27/08/13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public class HornetQProjectComponent implements ProjectComponent,Configurable
{
   HornetQProjectConfigurationForm form = new HornetQProjectConfigurationForm();
   private String hornetQHome;

   public HornetQProjectComponent(Project project)
   {
      System.out.println("HornetQProjectComponent.HornetQProjectComponent");
   }

   public void initComponent()
   {
      // TODO: insert component initialization logic here
   }

   public void disposeComponent()
   {
      // TODO: insert component disposal logic here
   }

   @NotNull
   public String getComponentName()
   {
      return "HornetQProjectComponent";
   }

   public void projectOpened()
   {
      // called when project is opened
   }

   public void projectClosed()
   {
      // called when project is being closed
   }

   @Nls
   @Override
   public String getDisplayName()
   {
      return "HornetQ Configuration";
   }

   @Nullable
   @Override
   public String getHelpTopic()
   {
      return null;
   }

   @Nullable
   @Override
   public JComponent createComponent()
   {
      if(form == null)
      {
         form = new HornetQProjectConfigurationForm();
      }
      return form.getForm();
   }

   @Override
   public boolean isModified()
   {
      return form != null && form.isModified(this);
   }

   @Override
   public void apply() throws ConfigurationException
   {
      if(form != null)
      {
         form.setData(this);
      }
   }

   @Override
   public void reset()
   {
     if(form != null)
     {
        form.getData(this);
     }
   }

   @Override
   public void disposeUIResources()
   {
      form = null;
   }

   public String getHornetQHome()
   {
      return hornetQHome;
   }

   public void setHornetQHome(String hornetQHome)
   {
      this.hornetQHome = hornetQHome;
   }
}
