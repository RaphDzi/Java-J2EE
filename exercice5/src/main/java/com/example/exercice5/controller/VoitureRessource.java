package com.example.exercice5.controller;

import com.example.exercice5.model.Voiture;
import com.example.exercice5.service.VoitureService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/voiture")
public class VoitureRessource {

    private VoitureService voitureService;

    @Inject
    public VoitureRessource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture oneVoiture() {
        return new Voiture(1, "Peugeot", 2015, "Rouge");
    }


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voiture> allVoitures() {
        List<Voiture> voitures = new ArrayList<>();
        voitures.add(new Voiture(1, "Peugeot", 2015, "Rouge"));
        voitures.add(new Voiture(2, "Renault", 2017, "Bleu"));
        voitures.add(new Voiture(3, "Toyota", 2020, "Noir"));
        return voitures;
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture createVoiture(Voiture voiture) {
        voiture.setId(99); // ou généré par ton service plus tard
        return voiture;
    }


    @GET
    @Path("/params")
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture createVoitureFromParams(@QueryParam("marque") String marque,
                                           @QueryParam("annee") int annee,
                                           @QueryParam("couleur") String couleur) {
        return new Voiture(77, marque, annee, couleur);
    }


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/delete")
    public Voiture deleteVoiture(@PathParam("id") int id) {
        return new Voiture(id, "Supprimée", 0, "N/A");
    }


    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture updateVoiture() {
        return voitureService.save("maVoitureDeFouUpdate",2025,"chrome");
    }



    @GET
    @Path("/response")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVoitureWithResponse() {
        Voiture voiture = new Voiture(88, "Tesla", 2023, "Blanc");
        return Response.status(Response.Status.CREATED).entity(voiture).build();
    }

}
