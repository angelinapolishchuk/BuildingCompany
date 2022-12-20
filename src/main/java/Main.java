import com.solvd.construction.Type;
import com.solvd.construction.building.Building;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.materials.Materials;
import com.solvd.construction.suppliers.Suppliers;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

import static com.solvd.construction.materials.Materials.createMaterialsList;

import static com.solvd.construction.suppliers.Suppliers.createListOfSuppliers;
import static java.lang.String.valueOf;

public class Main {

    private Building building;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) {

        Set<Materials> materials = createMaterialsList();
        LOGGER.info("List of materials{}:" + materials);


        ArrayList<Suppliers> suppliers = createListOfSuppliers();
        LOGGER.info("List of suppliers {}:" + suppliers);

    }
    }


