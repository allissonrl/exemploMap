import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("crio um dicionario que relacione os modelos e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol", 14.4);
            put("uno", 14.4);
            put("mobi", 14.4);
            put("hb20", 14.4);
            put("kwid", 14.4);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println ("Substitua o consumo do gol por 15.2 kml:");

        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("confira se o modelo tucson esta no dicionario:" + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("exiba os modelos");
        carrosPopulares.keySet();

        System.out.println("exiba os consumos dos carro: ");
        carrosPopulares.values();

        System.out.println("exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
        }

        System.out.println("modelo mais eficiente: "+ modeloMaisEficiente+ "-" + consumoMaisEficiente);

        System.out.println("exiba a soma dos consumos: ");
        Iterable<Double> iterator = (Iterable<Double>) carrosPopulares.values().iterator();
        Double soma = 0d;
        while(((Iterator<?>) iterator).hasNext()){
            soma += ((Iterator<?>) iterator).next();
        }
        System.out.println("Exiba as somas dos consumos: " + soma);

        System.out.println("exiba a media dos consumos deste dicionario de carros: " + (soma/carrosPopulares.size()));

        System.out.println(" Remova os modelos com o comsumo igual a15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println("exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>();
        System.out.println(carrosPopulares2.toString());


        System.out.println("apague o dicionario de caros: ");
        carrosPopulares.clear();

        System.out.println("confira se esta vazia: " + carrosPopulares.isEmpty());


    }


}


