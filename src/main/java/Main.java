import com.solvd.construction.Type;
import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.buildingtypes.IndustrialBuildings;
import com.solvd.construction.exceptions.EBuildingsException;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.suppliers.Suppliers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;

import static com.solvd.construction.materials.Materials.createMaterialsList;

import static com.solvd.construction.suppliers.Suppliers.createListOfSuppliers;
import static java.lang.String.valueOf;

public class Main {

    private Building building;
    private Buildings buildings;

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) throws IOException, EBuildingsException {

        LOGGER.info("Construction start date: " + Building.getStartDate());
        LOGGER.info("Construction end date: " + Building.getEndDate());
        LOGGER.info("Price of the industrial building is: " + Building.getPrice1());
        LOGGER.info("Price of the civil building is: " + Building.getPrice2());
        LOGGER.info("Price of the agricultural building is: " + Building.getPrice3());
        LOGGER.info("We are starting the construction of your type of building: " + Buildings.getBuildingType());

    }
    }


