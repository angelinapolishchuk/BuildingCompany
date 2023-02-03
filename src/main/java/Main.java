
import com.solvd.construction.Type;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.DataBuilder;

import com.solvd.construction.exceptions.*;
import com.solvd.construction.inputdata.InputData;

import java.util.logging.Logger;



public class Main {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) throws EBuildingTypeIsNull, EBudgetSizeException, ECreditSizeException, EInvalidBuildersSalary, EInvalidBudgetException {

        ProjectsOfBuildingCompany newProject = new ProjectsOfBuildingCompany();

        String buildingType = String.valueOf(InputData.inputOfTheBuildingType());
        newProject.setBuildingType(buildingType);
        newProject.setBudget(InputData.inputOfTheBudget());
        newProject.setBuilding(DataBuilder.createBuilding(Type.valueOf(buildingType)));
        newProject.setBuilding(DataBuilder.startBuilding(Type.valueOf(buildingType), newProject).getBuilding());
        LOGGER.info("Creating a new project: " + newProject);

    }
}


