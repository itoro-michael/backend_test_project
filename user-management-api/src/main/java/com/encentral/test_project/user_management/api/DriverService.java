/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encentral.test_project.user_management.api;

import java.util.List;

import com.encentral.test_project.commons.exceptions.ResourceNotFound;
import com.encentral.test_project.entities.JpaDriver;

/**
 *
 * @author James Akinniranye
 */
public interface DriverService 
{

	JpaDriver find(String driverId) throws ResourceNotFound;

	JpaDriver create(JpaDriver driverDO);

	void delete(String driverId) throws ResourceNotFound;

	JpaDriver assignCar(String driverId, String carId) throws ResourceNotFound, CarAlreadyInUseException;

	JpaDriver unAssignCar(String driverId, String carId) throws ResourceNotFound, CarNotInUseException;

	List<JpaDriver> findAll();

	List<JpaDriver> findDriver(String username, String online_status, String license_plate, Integer rating);

}
