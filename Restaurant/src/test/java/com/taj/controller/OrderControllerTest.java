
package com.taj.controller;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.tools.configuration.base.MethodRef;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.taj.dao.OrderDao;
import com.taj.model.CustomerInfo;
import com.taj.validator.CustomerInfoValidator;

@Generated(value = "org.junit-tools-1.1.0")
@RunWith(Suite.class)
@ContextConfiguration(locations = { "classpath:**/taj-servlet.xml" })
public class OrderControllerTest {

	private OrderController createTestSubject() {
		return new OrderController();
	}

	@MethodRef(name = "getOrderDao", signature = "()QOrderDao;")
	@Test
	public void testGetOrderDao() throws Exception {
		OrderController testSubject;
		OrderDao result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getOrderDao();
	}

	@MethodRef(name = "setOrderDao", signature = "(QOrderDao;)V")
	@Test
	public void testSetOrderDao() throws Exception {
		OrderController testSubject;
		OrderDao orderDao = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setOrderDao(orderDao);
	}

	@MethodRef(name = "getCustomerInfoValidator", signature = "()QCustomerInfoValidator;")
	@Test
	public void testGetCustomerInfoValidator() throws Exception {
		OrderController testSubject;
		CustomerInfoValidator result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCustomerInfoValidator();
	}

	@MethodRef(name = "setCustomerInfoValidator", signature = "(QCustomerInfoValidator;)V")
	@Test
	public void testSetCustomerInfoValidator() throws Exception {
		OrderController testSubject;
		CustomerInfoValidator customerInfoValidator = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setCustomerInfoValidator(customerInfoValidator);
	}

	@MethodRef(name = "checkout", signature = "(QHttpServletRequest;QModel;)QString;")
	@Test
	public void testCheckout() throws Exception {
		OrderController testSubject;
		HttpServletRequest httpServletRequest = null;
		Model map = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.checkout(httpServletRequest, map);
	}

	@MethodRef(name = "checkout", signature = "(QHttpServletRequest;QModel;QCustomerInfo;QBindingResult;)QString;")
	@Test
	public void testCheckout_1() throws Exception {
		OrderController testSubject;
		HttpServletRequest httpServletRequest = null;
		Model map = null;
		CustomerInfo customerForm = null;
		BindingResult bindingResult = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.checkout(httpServletRequest, map, customerForm, bindingResult);
	}

	@MethodRef(name = "orderConfirmation", signature = "(QHttpServletRequest;QModelMap;)QString;")
	@Test
	public void testOrderConfirmation() throws Exception {
		OrderController testSubject;
		HttpServletRequest httpServletRequest = null;
		ModelMap map = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.orderConfirmation(httpServletRequest, map);
	}

	@MethodRef(name = "placeOrder", signature = "(QHttpServletRequest;QModel;)QString;")
	@Test
	public void testPlaceOrder() throws Exception {
		OrderController testSubject;
		HttpServletRequest httpServletRequest = null;
		Model model = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.placeOrder(httpServletRequest, model);
	}

	@MethodRef(name = "findOrder", signature = "(QString;QModel;)QString;")
	@Test
	public void testFindOrder() throws Exception {
		OrderController testSubject;
		String v = "";
		Model map = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.findOrder(v, map);
	}

	@MethodRef(name = "getOrderDetails", signature = "(QString;QModel;)QString;")
	@Test
	public void testGetOrderDetails() throws Exception {
		OrderController testSubject;
		String id = "";
		Model map = null;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getOrderDetails(id, map);
	}
}