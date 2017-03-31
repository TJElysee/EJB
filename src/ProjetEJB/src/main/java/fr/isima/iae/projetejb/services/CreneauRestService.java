/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Creneaux;
import fr.isima.iae.projetejb.managers.ICabinetMedical;
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

@Path("/creneaux")
@Produces(MediaType.APPLICATION_JSON)
public class CreneauRestService {
    
    private static final Logger LOGGER = Logger.getLogger(PatientRestService.class.getName()) ;
    
    @EJB
    private ICabinetMedical cabMed;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public int create(Creneaux c) {
        LOGGER.log(Level.INFO, "POST /creneaux");
        return cabMed.addCreneau(c.getDebut(), c.getFin(), c.getMedecin().getId());
    }


     @GET
    public List<Creneaux> getCreneaux() {
        LOGGER.log(Level.INFO, "GET /AllCreneaux");
        return cabMed.getAllCreneaux();
    }
}
