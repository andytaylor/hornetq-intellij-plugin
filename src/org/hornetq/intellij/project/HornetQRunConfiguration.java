package org.hornetq.intellij.project;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationInfoProvider;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RunConfigurationBase;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.configurations.RuntimeConfigurationException;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.JDOMExternalizable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;


public class HornetQRunConfiguration extends RunConfigurationBase
{
   private JPanel panel1;
   private JLabel configLocationLabel;
   private TextFieldWithBrowseButton configLocation;

   public HornetQRunConfiguration(Project project, HornetQConfigurationFactory hornetQConfigurationFactory, String s)
   {
      super(project, hornetQConfigurationFactory, s);
   }


   @Override
   public SettingsEditor<? extends RunConfiguration> getConfigurationEditor()
   {
      return new HornetQSettingsEditor();
   }

   @Nullable
   @Override
   public JDOMExternalizable createRunnerSettings(ConfigurationInfoProvider configurationInfoProvider)
   {
      return null;
   }

   @Nullable
   @Override
   public SettingsEditor<JDOMExternalizable> getRunnerSettingsEditor(ProgramRunner programRunner)
   {
      return null;
   }

   @Nullable
   @Override
   public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment executionEnvironment) throws ExecutionException
   {
      return null;
   }

   @Override
   public void checkConfiguration() throws RuntimeConfigurationException
   {
      //To change body of implemented methods use File | Settings | File Templates.
   }
}
