package org.hornetq.intellij.project;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.ui.DocumentAdapter;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

@State(name = "org.hornetq.intellij.project.HornetQProjectComponent", storages = {@Storage(file = "$WORKSPACE_FILE$"
)})
public class HornetQProjectComponent implements ProjectComponent,Configurable, PersistentStateComponent<ProjectState>
{
   ProjectState projectState = new ProjectState();

   private HornetQProjectConfigurationForm form;


   public HornetQProjectComponent()
   {
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
         form.getHornetQHome().addBrowseFolderListener("Choose HornetQ Home",
               "Choose the directory where HornetQ standalone is deployed or a checked out from git",
               null,
               FileChooserDescriptorFactory.createSingleFolderDescriptor());

         form.getHornetQHome().getTextField().getDocument().addDocumentListener(new DocumentAdapter()
         {

            public void textChanged(DocumentEvent event)
            {
               onHornetQHomeChanged();
            }
         });
      }

      return form.getForm();
   }

   private void onHornetQHomeChanged()
   {
      String newHome = form.getHornetQHome().getText();
      //todo some validation
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
         form.getData(this);
      }
   }

   @Override
   public void reset()
   {
     if(form != null)
     {
        form.setData(this);
     }
   }

   @Override
   public void disposeUIResources()
   {
      form = null;
   }

   public String getHornetQHome()
   {
      return projectState.hornetQHome;
   }

   public void setHornetQHome(String hornetQHome)
   {
      this.projectState.hornetQHome = hornetQHome;
   }

   public void loadState(ProjectState state)
   {
      projectState = state;
   }

   public ProjectState getState()
   {
      return projectState;
   }
}
