package repository.product;

import base.repository.BaseRepository;
import model.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductRepository extends BaseRepository<Integer, Product> {

    Product[] loadAll() throws SQLException;

    int checkCount(int id)throws SQLException;
}
