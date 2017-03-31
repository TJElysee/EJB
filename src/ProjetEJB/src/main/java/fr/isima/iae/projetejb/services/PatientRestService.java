/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Patient;
import fr.isima.iae.projetejb.managers.IPatientManager;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author hassan
 * @author ousmane
 */

@Path("/patients")
@Produces(MediaType.APPLICATION_JSON)
public class PatientRestService {
    
    private static final Logger LOGGER = Logger.getLogger(PatientRestService.class.getName()) ;
    
    @EJB
    private IPatientManager patMan;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(Patient p) {
        return patMan.addPatient(p);
    }

    @GET
    public List<Patient> getAll() {
        LOGGER.log(Level.INFO, "GET /patients");
        return patMan.getAllPatients();
    }

    @GET
    @Path("/{id}")
    public Patient getOne(@PathParam(value = "id") int id) {
        LOGGER.log(Level.INFO, "GET /patients/{0}", id);
        return patMan.getPatient(id) ;
    }
    
    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(@PathParam("id") int id, Patient p) 
    {
        LOGGER.log(Level.INFO, "PUT /patients/{0}", id);
        LOGGER.log(Level.INFO, p.toString());
        LOGGER.log(Level.INFO, p.getNom() + '-' + p.getPrenom());

        patMan.updatePatient(id, p);
    }
    
    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") int id)
    {
        LOGGER.log(Level.INFO, "DELETE /patients/{0}", id);
        patMan.deletePatient(id);
    }    
}
