package org.hornetq.intellij.project;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;


public class HornetQConfigurationFactory extends ConfigurationFactory
{
   protected HornetQConfigurationFactory(ConfigurationType type)
   {
      super(type);
   }

   @Override
   public RunConfiguration createTemplateConfiguration(Project project)
   {
      return new HornetQRunConfiguration(project, this, "HQ wahey");
   }
}
