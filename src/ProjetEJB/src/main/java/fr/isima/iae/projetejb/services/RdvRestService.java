/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.RDV;
import fr.isima.iae.projetejb.managers.ICabinetMedical;
import java.util.Date;
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

@Path("/rdvs")
@Produces(MediaType.APPLICATION_JSON)
public class RdvRestService {
    
    private static final Logger LOGGER = Logger.getLogger(RdvRestService.class.getName()) ;
    
    @EJB
    private ICabinetMedical cabMed;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(RDV r) {
        LOGGER.log(Level.INFO, "POST /rdvs");
        return cabMed.takeRDV(r.getCreneau().getDebut(), r.getPatient().getId(), r.getCreneau().getMedecin().getId());
    }
    
    @GET
    public List<RDV> getAll() {
        LOGGER.log(Level.INFO, "GET /rdvs");
        return cabMed.getAllRDV();
    }
    
    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(@PathParam("id") int id, RDV r) 
    {
        LOGGER.log(Level.INFO, "PUT /rdvs/{0}", id);
        LOGGER.log(Level.INFO, r.toString());

        cabMed.editRDV(id, r.getCreneau().getDebut());
    }
    
    @Path("/{id}")
    @DELETE
    public void delete(@PathParam("id") int id)
    {
        LOGGER.log(Level.INFO, "DELETE /rdvs/{0}", id);
        cabMed.cancelRDV(id);
    } 
}
