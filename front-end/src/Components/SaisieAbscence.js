import { useState, useEffect } from 'react';
import '../Styles/SaisieAbsCSS.css';

function SaisieAbscence() {
    // Liste des étudiants
    const [etudiants, setEtudiants] = useState([]); 
    // Pour stocker les absences saisies
    const [absences, setAbsences] = useState([]); 
     

    // Utilisation de useEffect pour simuler le remplissage de données depuis une API
    useEffect(() => {
        // Simuler des données d'étudiants venant de la BDD
        const Essai = [
            { id: 1, nom: 'Malki', prenom: 'Nawal' },
            { id: 2, nom: 'Malki', prenom: 'Amine' },
        ];
        setEtudiants(Essai);
    }, []);

    // Il faut par la suite définir la fonction qui gérera le changement des valeurs d'absence
    // const handleAbsenceChange = (e, id) => {
        
    // };

    return (
        <div className="container">
            <h1 className='title'>Gestion des absences</h1>
            <table className="abs-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Date</th>
                        <th>Commentaire</th>
                        <th>Abscence</th>
                    </tr>
                </thead>
                <tbody>
                    {etudiants.map((etudiant) => (
                        <tr key={etudiant.id}>
                            <td>{etudiant.id}</td>
                            <td>{etudiant.nom}</td>
                            <td>{etudiant.prenom}</td>
                            <td>
                                <input
                                className='dateInput'
                                    type="date"
                                    name="date"
                                    // onChange={(e) => handleAbsenceChange(e, etudiant.id)}
                                />
                            </td>
                            <td>
                                <input
                                className='commentInput'
                                    type="text"
                                    name="commentaire"
                                    placeholder="Commenter"
                                    // onChange={(e) => handleAbsenceChange(e, etudiant.id)}
                                />
                            </td>
                            <td>
                            <input
                                    className='absenceCheckbox'
                                    type="checkbox"
                                    name="abscence"
                                    //checked={abscences[etudiant.id] || false} 
                                    // onChange={(e) => handleAbsenceChange(e, etudiant.id)} 
                                />
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default SaisieAbscence;
