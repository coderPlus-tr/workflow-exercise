import bean.BookInfo;
import dao.BaseDao;
import dao.BookInfoDao;

import java.util.List;
import java.util.Random;

/**
 * @Auther: jackyar
 * @Date: 2021/4/24 17:44
 * @Description:
 */
public class BookInfoDaoImpl extends BaseDao implements BookInfoDao {
    /**
     * 返回表中所有图书的数量, 主要提供给图书推荐功能使用
     * 根据该数量确定随机数范围
     *
     * @return
     */
    @Override
    public int countBookInfo() {
        // TODO: 2021/4/24 吕洽闻
<<<<<<< HEAD
        // System.out.println("功能开发中...");
        String sql = "SELECT COUNT(1) FROM book_info";
=======
//        System.out.println("功能开发中...");
        String sql = "select count(1) from book_info";
>>>>>>> ee01ab38d2483256d80c610207d461ac1ee47d6d
        BaseDao dao = new BaseDao();
        return dao.querySingleValue(sql);
    }

    /**
     * 查询图书，显示所有图书信息
     *
     * @return 返回图书集合
     */
    @Override
    public List<BookInfo> queryBookDao() {
        // TODO: 2021/4/24 鄢宇航
        // System.out.println("功能开发中...");
        String sql = "SELECT * FROM book_info";
        return new BaseDao().query(BookInfo.class,sql);
    }

    /**
     * 增加图书，把新增的图书信息写入数据库
     *
     * @param name
     * @param author
     * @param publish
     * @return 返回-1添加失败，否则成功
     */
    @Override
    public int addBookInfo(String name, String author, String publish) {
        // TODO: 2021/4/24 安泽铭
<<<<<<< HEAD
        // System.out.println("功能开发中...");
=======
>>>>>>> ee01ab38d2483256d80c610207d461ac1ee47d6d
        String sql = "INSERT INTO book_info(name,author,publish) VALUES(?,?,?)";
        return new BaseDao().update(sql,name,author,publish);
    }

    /**
     * 更具图书名称删除相应的图书记录
     *
     * @param name
     * @return 返回-1删除失败，否则删除成功
     */
    @Override
    public int deleteBookInfoByName(String name) {
        // TODO: 2021/4/24 林凯斌
<<<<<<< HEAD
        // System.out.println("功能开发中...");
        String sql = "DELETE FROM book_info WHERE book_info.`name` = ?";
        return new BaseDao().update(sql, name);
=======
        //System.out.println("功能开发中...");
        String sql =  'DELETE FROM book_info WHERE book_info.'name'= ? ';
        return new BaseDao().updata(sql,name);
>>>>>>> ee01ab38d2483256d80c610207d461ac1ee47d6d
    }

    /**
     * 图书修改功能，仅修改图书名称
     *
     * @param name
     * @param rename
     * @return 返回-1修改失败，否则修改成功
     */
    @Override
    public int updateBookInfoByName(String name, String rename) {
        // TODO: 2021/4/24 吴家劲
<<<<<<< HEAD
        // System.out.println("功能开发中...");
=======
>>>>>>> ee01ab38d2483256d80c610207d461ac1ee47d6d
        String sql = "UPDATE book_info SET book_info.`name`=? WHERE book_info.`name`=?";
        return new BaseDao().update(sql, rename, name);
    }

    /**
     * 推荐图书，根据Random随机出一个图书ID
     *
     * @return 返回null则查找失败
     */
    @Override
    public BookInfo pushBook() {
        // TODO: 2021/4/24 李明特
<<<<<<< HEAD
        // System.out.println("功能开发中...");
        Random random = new Random();
        int i = random.nextInt(countBookInfo());
        String sql = "SELECT * FROM book_info WHERE book_info.id=?";
        List<BookInfo> list = new BaseDao().query(BookInfo.class, sql, i);
=======
        Random random = new Random();
        int i = random.nextInt(countBookInfo());
        String sql = "select * from book_info where book_info.id=?";
        List<BookInfo> list = new BaseDao().query(BookInfo.class,sql,i);
>>>>>>> ee01ab38d2483256d80c610207d461ac1ee47d6d
        return list.get(0);
    }
}
