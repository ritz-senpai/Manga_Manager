package dao;

import hibernateutil.HibernateUtil;
import model.Manga;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MangaDao {

    public void saveManga(Manga manga){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession())
        {
          transaction = session.beginTransaction();
          session.save(manga);
          transaction.commit();
        } catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }

    }//end of method

    public void deleteManga(int mangaId){
        Transaction transaction=null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Manga manga = session.get(Manga.class,mangaId);

            if (manga!=null){
            session.delete(manga);
            transaction.commit();
                System.out.println("Manga with ID "+mangaId+" deleted successfully.........!");
            }else {  System.out.println("Manga not found with ID: " + mangaId);}
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }//end of method

    public List<Manga> getAllManga() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Manga", Manga.class).list();
        }
    }
}
