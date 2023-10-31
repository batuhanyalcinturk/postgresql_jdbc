package org.example;

import org.example.model.Ders;
import org.example.model.Konu;
import org.example.model.Ogretmen;
import org.example.repository.DersRepository;
import org.example.repository.KonuRepository;
import org.example.repository.OgretmenRepository;

import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static OgretmenRepository ogretmen_repo = new OgretmenRepository();
    private static DersRepository ders_repo = new DersRepository();
    private static KonuRepository konu_repo = new KonuRepository();

    public static void main(String[] args)
    {
        try
        {
//			System.err.println(ogretmen_repo.save(new Ogretmen("gökhan", true)));
            System.err.println(ogretmen_repo.getAll());
			System.err.println(ders_repo.getAll());
			System.err.println(konu_repo.getAll());
//			System.err.println(ders_repo.getAllDTO());
//            System.err.println(ders_repo.save(new Ders(1,1)));
//            System.err.println(konu_repo.save(new Konu("Konu")));
//			System.err.println(ogretmen_repo.getByID(22));
//			System.err.println(ogretmen_repo.deleteByID(7));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}