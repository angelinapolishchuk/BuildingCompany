import com.solvd.construction.CartographicObject;
import com.solvd.construction.Type;
import com.solvd.construction.acceptance.Acceptance;
import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.materials.FerroconcretePlate;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.materials.Wood;
import com.solvd.construction.priceofbuilding.PriceOfBuilding;
import com.solvd.construction.request.Request;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static com.solvd.construction.acceptance.Acceptance.dateFormat2;
import static com.solvd.construction.buildingtypes.Buildings.addBuildingsType;
import static com.solvd.construction.buildingtypes.Buildings.buildingType;
import static com.solvd.construction.materials.FerroconcretePlate.createFerroconcretePlateList;
import static com.solvd.construction.materials.Materials.createMaterialsList;
import static com.solvd.construction.request.Request.createQueueList;
import static com.solvd.construction.staff.Builder.createBuilderList;
import static com.solvd.construction.suppliers.Suppliers.createListOfSuppliers;
import static java.lang.String.valueOf;

public class Main {
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Main.class));
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) {
        Queue<Request> requests = createQueueList();
        LOGGER.info("Queue list {}:" + requests);

        LinkedList<Builder> builders = createBuilderList();
        LOGGER.info("List Of builders {}:" + builders);

        Set<Materials> materials = createMaterialsList();
        LOGGER.info("List of materials{}:" + materials);

        Map<Type, Buildings> buildingTypes = addBuildingsType();
        LOGGER.info("List of buildings types {}:" + buildingTypes);

        ArrayList<Suppliers> suppliers = createListOfSuppliers();
        LOGGER.info("List of suppliers {}:" + suppliers);

        LOGGER.info("Report on the construction of a new building:");

        LOGGER.info("Building type – " + buildingType);

        LOGGER.info("Price is " + PriceOfBuilding.price);

        LOGGER.info("Accepted" + dateFormat2);

        try {
            SimpleDateFormat dateFormat3 = new SimpleDateFormat("dd.MM.yyyy");
            Date dateFormat = dateFormat3.parse(valueOf(Building.dateFormat));
            Date dateFormat2 = dateFormat3.parse(valueOf(Acceptance.dateFormat2));

            int days = (int) ((dateFormat.getTime() - dateFormat2.getTime()) / (24 * 60 * 60 * 1000));
            LOGGER.info("Construction time in days:" + days);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           LOGGER.info(valueOf(dateFormat));
        }
    }
    }


