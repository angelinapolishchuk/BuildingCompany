import com.solvd.construction.Type;
import com.solvd.construction.building.Building;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

import static com.solvd.construction.buildingtypes.Buildings.*;
import static com.solvd.construction.materials.Materials.createMaterialsList;

import static com.solvd.construction.suppliers.Suppliers.createListOfSuppliers;
import static java.lang.String.valueOf;

public class Main {

    private Building building;

    private static int priceOfTheBuilding;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException, EBuildingsException {

        ProjectsOfBuildingCompany newProject = new ProjectsOfBuildingCompany();
        Scanner sc = new Scanner(System.in);

        LOGGER.info("Please, enter the type of building you need: ");
        String buildingType = sc.nextLine();
        LOGGER.info("Check up: the building type you need is – " + buildingType);

        Building.choiceOfTheBuildingPrice(buildingType);

        LOGGER.info("Please, enter your budget to calculate if you need a credit for the construction: ");
        final int budget = sc.nextInt();
        LOGGER.info("Check up: your budget is  " + budget);

        newProject.setBudget(budget);


        LOGGER.info("Approximate construction start date: " + Building.getStartDate());
        LOGGER.info("On average, the construction of a building takes 26 months. Approximate construction end date: " + Building.getEndDate());

        sc.close();
    }
    }



