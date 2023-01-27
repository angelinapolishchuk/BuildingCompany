
import com.solvd.construction.Type;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.DataBuilder;

import com.solvd.construction.exceptions.EBudgetSizeException;
import com.solvd.construction.exceptions.EBuildingTypeIsNull;
import com.solvd.construction.exceptions.EInvalidBudgetException;

import java.util.*;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws Exception{

        ProjectsOfBuildingCompany newProject = new ProjectsOfBuildingCompany();
        Scanner sc = new Scanner(System.in);

       LOGGER.info("Please, enter the type of building you need: ");
       String buildingType = sc.nextLine();
       try {
           if(buildingType.length() == 0){
               LOGGER.info("Try again, if you haven't write a building type or skip it if you do it: ");
               buildingType = sc.nextLine();
               throw new EBuildingTypeIsNull("You haven't write a building type! Try again: ");
           }
           } catch (EBuildingTypeIsNull e) {
           LOGGER.info("Error " + e);
       }
           finally {
           LOGGER.info("Check up: the building type you need is – " + buildingType );
           try {
               if (buildingType.length() == 0) {
                   LOGGER.info("Try again, if you haven't write a building type or skip it if you do it: ");
                   buildingType = sc.nextLine();
               }


               LOGGER.info("Please, enter your budget to calculate if you need a credit for the construction: ");
               final int budget = sc.nextInt();
               if (budget < 0) {
                   throw new EInvalidBudgetException("You have entered incorrect budget!");

               } else {
                   LOGGER.info("Check up: your budget is  " + budget);
               }

               if (budget > 99999999) {
                   throw new EBudgetSizeException("You have entered incorrect budget! It should be less than 8 signs");
               }
// добавить чтобы доходило до конца возможность исправить , в рандомном случае на исключение, в коллекции
               newProject.setBudget(budget);
               newProject.setBuilding(DataBuilder.createBuilding(Type.valueOf(buildingType)));
               newProject.setBuilding(DataBuilder.startBuilding(Type.valueOf((buildingType)), newProject).getBuilding());
               LOGGER.info("Creating a new project: " + newProject);
               sc.close();
           } finally {
               LOGGER.info("The program is successfully closed ");
           }
       }
    }}

