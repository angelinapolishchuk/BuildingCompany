import com.solvd.construction.Type;
import com.solvd.construction.buildingtypes.Buildings;
import com.solvd.construction.materials.FerroconcretePlate;
import com.solvd.construction.materials.Wood;
import com.solvd.construction.request.Request;
import com.solvd.construction.staff.Builder;
import com.solvd.construction.suppliers.Suppliers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
    public static Map<Type, Buildings> addBuildingsType() {
        return Map.of(Type.CIVIl, new Buildings(Type.CIVIl, 20, 2000) {
                    @Override
                    public void displayBuildingsInformation() {

                    }
                },
                Type.AGRICULTURAL, new Buildings(Type.AGRICULTURAL, 2, 1000) {
                    @Override
                    public void displayBuildingsInformation() {

                    }
                },
                Type.INDUSTRIAL, new Buildings(Type.INDUSTRIAL, 10, 5000) {
                    @Override
                    public void displayBuildingsInformation() {

                    }
                });
    }

    public static ArrayList<Suppliers> createListOfSuppliers() {
        ArrayList<Suppliers> suppliers = new ArrayList<>();
        suppliers.add(new Suppliers("materials", 5000));
        suppliers.add(new Suppliers("tools", 100));
        suppliers.add(new Suppliers("equipment", 1100));
        return suppliers;
    }

    public static LinkedList<Builder> createBuilderList() {
        LinkedList<Builder> builders = new LinkedList<>();
        Builder builder1 = new Builder("Павел", "Петров", 22, "инженер-строитель");
        Builder builder2 = new Builder("Самвел", "Петриков", 25, "инженер-строитель");
        Builder builder3 = new Builder("Пётр", "Сидоров", 32, "техник-строитель");
        builders.add (builder1);
        builders.add (builder2);
        builders.add (builder3);
        return builders;
    }
    public static Set<FerroconcretePlate> createFerroconcretePlateList(){
        Set<FerroconcretePlate> ferroconcretePlates = new HashSet<>();
        FerroconcretePlate FerroconcretePlate1 = new FerroconcretePlate(5000, 1500);
        FerroconcretePlate FerroconcretePlate2 = new FerroconcretePlate(4000, 1000);
        FerroconcretePlate FerroconcretePlate3 = new FerroconcretePlate(3000, 1000);
        ferroconcretePlates.add(FerroconcretePlate1);
        ferroconcretePlates.add(FerroconcretePlate2);
        ferroconcretePlates.add(FerroconcretePlate3);
        return ferroconcretePlates;
    }

    public static Queue<Request> createQueueList() {
        Queue<Request> requests = new PriorityQueue<>();
        Request Request1 = new Request(120000);
        Request Request2 = new Request(150000);
        Request Request3 = new Request(800000);
        requests.add(Request1);
        requests.add(Request2);
        requests.add(Request3);
        return requests;
    }

    public static List<Integer> createWoodList() {
        List<Integer>
                woods = new LinkedList<Integer>();
        Wood Wood1 = new Wood("cedar", 500);
        Wood Wood2 = new Wood("cedar", 600);
        Wood Wood3 = new Wood("pine", 1080);
        woods.add(Wood1.getAmountOfWood());
        woods.add(Wood2.getAmountOfWood());
        woods.add(Wood3.getAmountOfWood());
        return woods;
    }
    }
