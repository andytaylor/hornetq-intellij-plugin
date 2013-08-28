package test;

import org.hornetq.intellij.project.HornetQProjectComponent;
import org.hornetq.intellij.project.ProjectState;

/**
 * Created with IntelliJ IDEA.
 * User: andy
 * Date: 28/08/13
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public class Test
{
   public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException
   {
      Class c = ProjectState.class;
      c.newInstance();
   }
}
