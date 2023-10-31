package org.example;

import org.example.model.Ders;
import org.example.model.Konu;
import org.example.model.Ogrenci;
import org.example.model.Ogretmen;
import org.example.repository.*;

import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static OgretmenRepository ogretmen_repo = new OgretmenRepository();
    private static DersRepository ders_repo = new DersRepository();
    private static KonuRepository konu_repo = new KonuRepository();
    private static OgrenciRepository ogrenci_repo = new OgrenciRepository();
    private static DersOgrenciRepository dersOgrenci_repo = new DersOgrenciRepository();

    public static void main(String[] args)
    {
        try
        {
//			System.err.println(ogretmen_repo.save(new Ogretmen("gökhan", true)));
            System.err.println(ogretmen_repo.getAll());
			System.err.println(ders_repo.getAll());
			System.err.println(konu_repo.getAll());
			System.err.println(ogrenci_repo.getAll());
			System.err.println(dersOgrenci_repo.getAll());
//			System.err.println(ders_repo.getAllDTO());
//            System.err.println(ders_repo.save(new Ders(1,1)));
//            System.err.println(ogrenci_repo.save(new Ogrenci("batuhan",931,22)));
//            System.err.println(konu_repo.save(new Konu("Konu")));
//			System.err.println(ogretmen_repo.getByID(22));
//			System.err.println(dersOgrenci_repo.getByID(2));
//			System.err.println(ogretmen_repo.deleteByID(7));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}