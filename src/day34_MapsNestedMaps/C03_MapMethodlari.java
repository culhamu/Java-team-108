package day34_MapsNestedMaps;

import day32_Sets_Maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali"));//false
        //Value değerinin tamamı sorulursa true bir kısmı sorulursa false döner

        System.out.println(ogrenciMap.getOrDefault(103, "Öğrenci Bulunamadı"));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(123, "Öğrenci Bulunamadı"));//"Öğrenci Bulunamadı"
        System.out.println(ogrenciMap.get(123));//null

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF

        ogrenciMap.put(103,"Ali-Cem-12-K-MF");
        System.out.println(ogrenciMap.get(103));//Ali-Cem-12-K-MF
    }
}
