package mz.com.backenddeveloper.test;

import org.hibernate.Session;
import org.junit.Test;

import mz.com.backenddeveloper.util.HibernateUtil;



public class CreateTable {

	@Test
	public void generate() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}

	}

