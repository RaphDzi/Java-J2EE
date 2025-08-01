</div> <!-- .container -->
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!-- Footer -->
<footer class="bg-primary text-white mt-5">
  <div class="container py-4">
    <div class="row">
      <!-- Colonne 1 -->
      <div class="col-md-4">
        <h5>À propos</h5>
        <p>Application de gestion hospitalière : patients, consultations, prescriptions et soins.</p>
      </div>
      <!-- Colonne 2 -->
      <div class="col-md-4">
        <h5>Navigation</h5>
        <ul class="list-unstyled">
          <li><a href="/webapp/patient/listPatient.jsp" class="text-white text-decoration-none">Liste des patients</a></li>
          <li><a href="/webapp/patient/addPatient.jsp" class="text-white text-decoration-none">Ajouter un patient</a></li>
        </ul>
      </div>
      <!-- Colonne 3 -->
      <div class="col-md-4">
        <h5>Contact</h5>
        <p>Email : support@hopital.com<br>Téléphone : +33 1 23 45 67 89</p>
      </div>
    </div>
  </div>

  <div class="text-center py-3 bg-dark">
    © <%= java.time.Year.now() %> Hôpital Manager - Tous droits réservés
  </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
