import com.solvd.construction.Type;
import com.solvd.construction.building.Building;
import com.solvd.construction.buildingcompany.ProjectsOfBuildingCompany;
import com.solvd.construction.buildingtypes.AgriculturalBuildings;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.CivilBuildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.materials.Materials;
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
    private Buildings buildings;
    private static int priceOfTheBuilding;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException, EBuildingsException {

        LOGGER.info("Hello! Please, follow the instructions and fill out the form for calculating the construction of your building. Approximate construction start date: " + Building.getStartDate());
        LOGGER.info("On average, the construction of a building takes 26 months. Approximate construction end date: " + Building.getEndDate());
        LOGGER.info("Our company builds three types of buildings, the prices of which are listed below.");
        LOGGER.info("Price of the industrial building is: " + Building.getPrice1());
        LOGGER.info("Price of the civil building is: " + Building.getPrice2());
        LOGGER.info("Price of the agricultural building is: " + Building.getPrice3());

        Scanner sc = new Scanner(System.in);
        LOGGER.info("Please, enter the type of building you need: ");
        final String buildingType = sc.nextLine();
        LOGGER.info("Check up: the building type you need is – " + buildingType);

        switch (buildingType) {
            case "agricultural" -> {
                LOGGER.info("The price of your building is " + String.valueOf(priceOfTheBuilding = Building.getPrice3()));
                break;
            }
            case "civil" -> {
                LOGGER.info("The price of your building is " + String.valueOf(priceOfTheBuilding = Building.getPrice2()));
                break;
            }
            case "industrial" -> {
                LOGGER.info("The price of your building is " + String.valueOf(priceOfTheBuilding = Building.getPrice1()));
                break;
            }
        }

        LOGGER.info("Please, enter your budget to calculate if you need a credit for the construction: ");
        final int budget = sc.nextInt();
        LOGGER.info("Check up: your budget is  " + budget);

        if (budget < priceOfTheBuilding) {
            LOGGER.info("You need a credit. The sum of credit is " + (priceOfTheBuilding - budget));
        } else if (budget > priceOfTheBuilding) {
            LOGGER.info("You don't need a credit. We can start the construction. Your rest sum is " + (budget - priceOfTheBuilding));
        }
        sc.close();
    }
    }


