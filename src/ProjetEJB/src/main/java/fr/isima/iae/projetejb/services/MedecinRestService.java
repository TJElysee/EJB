/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Medecin;
import fr.isima.iae.projetejb.managers.IMedecinManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
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
@Path("/medecins")
@Produces(MediaType.APPLICATION_JSON)
public class MedecinRestService {
    
    private static final Logger LOGGER = Logger.getLogger(MedecinRestService.class.getName()) ;
    
    @EJB
    private IMedecinManager medMan;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(Medecin m)
    {
        LOGGER.log(Level.INFO, "POST /medecins");
        return medMan.addMedecin(m) ;
    }

    @GET
    public List<Medecin> getAll() {
        LOGGER.log(Level.INFO, "GET /medecins");
        return medMan.getAllMedecins();
    }

    @GET
    @Path("/{id}")
    public Medecin getOne(@PathParam(value = "id") int id) {
        LOGGER.log(Level.INFO, "GET /medecins/{0}", id);
        return medMan.getMedecin(id) ;
    }
    
    @Path("/{id}")
    @PUT
    public void update(@PathParam("id") int id, Medecin m) 
    {
        LOGGER.log(Level.INFO, "PUT /medecins/{0}", id);
        LOGGER.log(Level.INFO, m.toString());
        medMan.updateMedecin(id, m);

    }
    
    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") int id)
    {
        LOGGER.log(Level.INFO, "DELETE /medecins/{0}", id);
        medMan.deleteMedecin(id);
    }
}
