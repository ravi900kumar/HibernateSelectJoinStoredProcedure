package java9r.dao.com;

import java.util.*;

import javax.xml.crypto.dsig.Transform;

import javassist.compiler.ast.Keyword;
import javassist.convert.Transformer;

import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.hibernate.type.*;

import java9r.entites.com.*;
import java9r.util.com.HibernateUtil;

public class JoinDAO {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")
	/////////////////////////////////////// get all records product and  orders /////////////

	public List<OrderDetailsJoin> JoinSP() {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			SQLQuery sqlq = sessionFactory.getCurrentSession().createSQLQuery("call joinSp()");
			return sqlq.setResultTransformer(Transformers.aliasToBean(OrderDetailsJoin.class)).list();

		} catch (Exception e) {
			return null;
		}
	}
 

}
