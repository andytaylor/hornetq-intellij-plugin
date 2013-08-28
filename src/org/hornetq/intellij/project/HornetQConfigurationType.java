package org.hornetq.intellij.project;

import com.intellij.execution.configurations.ConfigurationTypeBase;


public class HornetQConfigurationType extends ConfigurationTypeBase
{
   public HornetQConfigurationType()
   {
      super("HornetQRunner", "HornetQ Runner", "Allows the running of a HornetQ Server", null);
      addFactory(new HornetQConfigurationFactory(this));
   }

}
