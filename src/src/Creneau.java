/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iaeproject;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/**
 *
 * @author vagrant
 */
@Entity
public class Creneau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private DateTime debut;
    private DateTime fin;
    
    @ManyToOne
    @JoinColumn(name = "id")
    private Medecin med;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getDebut() {
        return debut;
    }

    public void setDebut(DateTime debut) {
        this.debut = debut;
    }

    public DateTime getFin() {
        return fin;
    }

    public void setFin(DateTime fin) {
        this.fin = fin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creneau)) {
            return false;
        }
        Creneau other = (Creneau) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.iaeproject.Creneau[ id=" + id + " ]";
    }
    
}
