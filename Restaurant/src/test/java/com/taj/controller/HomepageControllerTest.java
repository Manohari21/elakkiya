package com.taj.controller;

import javax.annotation.Generated;

import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;
import org.springframework.ui.ModelMap;

import com.taj.dao.ProductDao;
import com.taj.entity.Product;

@Generated(value = "org.junit-tools-1.1.0")
public class HomepageControllerTest {

	private HomepageController createTestSubject() {
		return new HomepageController();
	}

	@MethodRef(name = "getProductDao", signature = "()QProductDao;")
	@Test
	public void testGetProductDao() throws Exception {
		HomepageController testSubject;
		ProductDao result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getProductDao();
	}

	@MethodRef(name = "setProductDao", signature = "(QProductDao;)V")
	@Test
	public void testSetProductDao() throws Exception {
		HomepageController testSubject;
		ProductDao productDao = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setProductDao(productDao);
	}

	@MethodRef(name = "homePage", signature = "(QModelMap;)QString;")
	@Test
	public void testHomePage() throws Exception {
		HomepageController testSubject = null;
		ModelMap model = new ModelMap(testSubject);
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.homePage(model);
	}
}