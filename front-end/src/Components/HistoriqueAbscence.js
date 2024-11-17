import '../Styles/SaisieAbsCSS.css'
import { useState } from 'react';
import { useEffect } from 'react';


function HistoriqueAbscence(){
    // Liste des étudiants
    const [etudiants, setEtudiants] = useState([]); 
     

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
    return(
        
        <div className='container'>
        <h1 className='title'>Historique des abscences</h1>
        <table className="abs-table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nom</th>
                        <th>Prénom</th>
                        <th>Abscences</th>
                        <th>Gestion</th>
                    </tr>
                </thead>
                <tbody>
                    {etudiants.map((etudiant) => (
                        <tr key={etudiant.id}>
                            <td>{etudiant.id}</td>
                            <td>{etudiant.nom}</td>
                            <td>{etudiant.prenom}</td>
                            <td>
                                liste des abscences
                            </td>
                            <td>
                                <button className='btn'>Modifier</button>
                                <button className='btn'>Supprimer</button>
                            </td>
                            
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    )
}

export default HistoriqueAbscence;