/**
 *
 */
package com.ilovecl.old.src.com.ilovecl.myproperty.DAO.impl;

import com.ilovecl.myproperty.DAO.IStudentDAO;
import com.ilovecl.myproperty.model.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author ������
 */
public class StudentDAO extends HibernateDaoSupport implements IStudentDAO {

    private static final Log log = LogFactory.getLog(StudentDAO.class);

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IStudentDAO#save(com.ilovecl.myproperty.model
     * .Student)
     */
    @Override
    public void save(Student transientInstance) {
        log.debug("save(Student transientInstance) in StudentDAO");
        try {
            this.getHibernateTemplate().saveOrUpdate(transientInstance);
            log.debug("save(Student transientInstance) in StudentDAO successful");
        } catch (RuntimeException re) {
            log.error("save(Student transientInstance) in StudentDAO failed",
                    re);
            throw re;
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IStudentDAO#delete(com.ilovecl.myproperty.
     * model.Student)
     */
    @Override
    public void delete(Student persistentInstance) {
        log.debug("delete(Student persistentInstance)");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete(Student persistentInstance) successful");
        } catch (RuntimeException re) {
            log.error("delete(Student persistentInstance) failed", re);
            throw re;
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see com.ilovecl.myproperty.DAO.IStudentDAO#findById(java.lang.Integer)
     */
    @Override
    public Student findById(Integer id) {
        log.debug("findById(Integer id) : " + id);
        try {
            Student instance = (Student) getHibernateTemplate().get(
                    "com.ilovecl.myproperty.model.Student", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("findById(Integer id) failed", re);
            throw re;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.ilovecl.myproperty.DAO.IStudentDAO#findByUsername(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> findByUserName(String userName) {
        List<Student> students;
        try {
            String queryString = "from Student as model where model."
                    + "userName" + "= ?";
            students = getHibernateTemplate().find(queryString, userName);
        } catch (RuntimeException re) {
            log.error("findByUserName failed", re);
            throw re;
        }

        return students;
    }

    @Override
    public boolean isStudentExits(String userName) {
        return findByUserName(userName).size() == 1;
    }
}
