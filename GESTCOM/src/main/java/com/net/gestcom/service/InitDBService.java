package com.net.gestcom.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.net.gestcom.entity.Role;
import com.net.gestcom.repository.ArticleRepository;
import com.net.gestcom.repository.BonLivraisonRepository;
import com.net.gestcom.repository.BonLivraisonRepository;
import com.net.gestcom.repository.CategorieRepository;
import com.net.gestcom.repository.ClientRepository;
import com.net.gestcom.repository.DevisRepository;
import com.net.gestcom.repository.FactureRepository;
import com.net.gestcom.repository.FournisseurRepository;
import com.net.gestcom.repository.MarqueRepository;
import com.net.gestcom.repository.RoleRepository;
import com.net.gestcom.repository.StockBLRepository;
import com.net.gestcom.repository.StockFactureRepository;
import com.net.gestcom.repository.StockNFRepository;
import com.net.gestcom.repository.UserRepository;
import com.net.gestcom.entity.Article;
import com.net.gestcom.entity.BonLivraison;
import com.net.gestcom.entity.Categorie;
import com.net.gestcom.entity.Client;
import com.net.gestcom.entity.Devis;
import com.net.gestcom.entity.Facture;
import com.net.gestcom.entity.Fournisseur;
import com.net.gestcom.entity.Marque;
import com.net.gestcom.entity.StockBL;
import com.net.gestcom.entity.StockFacture;
import com.net.gestcom.entity.StockNF;
import com.net.gestcom.entity.User;
import com.sun.org.apache.bcel.internal.generic.IXOR;

@Transactional
@Service
public class InitDBService {
	
	@Autowired
	private StockBLRepository stockBLRepository;
	
	@Autowired
	private StockFactureRepository stockFactureRepository;
	
	@Autowired
	private StockNFRepository stockNFRepository;

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private BonLivraisonRepository bonLivraisonRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	@Autowired
	private MarqueRepository marqueRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BonLivraisonRepository blRepository;
	
	@Autowired
	private DevisRepository devisRepository;
	
	@Autowired
	private FactureRepository factureRepository;
	
	@PostConstruct
	private void Init(){
		
		Role roleUser =new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin =new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		
		User userAdmin=new User();
		userAdmin.setName("ADMIN");
		userAdmin.setEnabled(true);
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		userAdmin.setPassword(encoder.encode("ADMIN"));
		userAdmin.setEmail("admin@gmail.com");
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		User user=new User();
		user.setName("USER");
		user.setEnabled(true);
		user.setPassword(encoder.encode("USER"));
		user.setEmail("user@gmail.com");
		List<Role> role=new ArrayList<Role>();
		role.add(roleUser);
		user.setRoles(role);
		userRepository.save(user);
		

		Categorie tab=new Categorie();
		tab.setNomCat("tablette");
		tab.setDescr("tablette");
		
		categorieRepository.save(tab);
		
		
		Categorie phone=new Categorie();
		phone.setNomCat("sellphone");
		phone.setDescr("smartphone");
		
		categorieRepository.save(phone);
		
		Categorie watch=new Categorie();
		watch.setNomCat("watch");
		watch.setDescr("smart watch");
		
		categorieRepository.save(watch);
		
		
		Categorie laptop=new Categorie();
		laptop.setNomCat("laptop");
		laptop.setDescr("notebook");
		
		categorieRepository.save(laptop);
		
		Marque apple=new Marque();
		apple.setName("apple");
		apple.setDescription("le chic");
		
		marqueRepository.save(apple);
		
		Marque nokia=new Marque();
		nokia.setName("nokia");
		nokia.setDescription("finlande");
		
		marqueRepository.save(nokia);
		
		Marque sony=new Marque();
		sony.setName("sony");
		sony.setDescription("sony");
		
		marqueRepository.save(sony);
		
		Marque samsung=new Marque();
		samsung.setName("samsung");
		samsung.setDescription("samsung mobile");
		
		marqueRepository.save(samsung);
		
		
		Article xperia=new Article();
		xperia.setDesignation("xperia p");
		xperia.setRef_Art("ref 1");
		xperia.setPrix_HTVA(800);
		xperia.setQuantite(300);
		xperia.setQuantite_min(30);
		xperia.setTVA(18);
		xperia.setCategorie(laptop);
		xperia.setMarque(samsung);
		articleRepository.save(xperia);
		
		Article iphone=new Article();
		iphone.setDesignation("iphone 5");
		iphone.setRef_Art("ref 2");
		iphone.setPrix_HTVA(1200);
		iphone.setQuantite(400);
		iphone.setQuantite_min(50);
		iphone.setTVA(18);
		iphone.setCategorie(laptop);
		iphone.setMarque(nokia);
		articleRepository.save(iphone);
		
		Article ipad=new Article();
		ipad.setDesignation("ipad 3");
		ipad.setRef_Art("ref 4");
		ipad.setPrix_HTVA(1000);
		ipad.setQuantite(500);
		ipad.setQuantite_min(80);
		ipad.setTVA(18);
		ipad.setCategorie(watch);
		ipad.setMarque(nokia);
		articleRepository.save(ipad);
		
		Article galaxy=new Article();
		galaxy.setDesignation("galaxy note");
		galaxy.setRef_Art("ref 7");
		galaxy.setPrix_HTVA(1500);
		galaxy.setQuantite(500);
		galaxy.setQuantite_min(80);
		galaxy.setTVA(18);
		galaxy.setCategorie(laptop);
		galaxy.setMarque(samsung);
		articleRepository.save(galaxy);
		


		Client client1=new Client();
		client1.setAdresseCl("mednine");
		client1.setEmail("lquhgiu@hotmail.fr");
		client1.setFax(72456756);
		client1.setMf("H5I78754667");
		client1.setPays("tunisia");
		client1.setNomCl("mourad");
		client1.setRc("56/879879Y");
		client1.setTel(75239879);
		clientRepository.save(client1);
		
		Client client=new Client();
		client.setAdresseCl("mednine");
		client.setEmail("lqjzhef@hotmail.fr");
		client.setFax(72476876);
		client.setMf("H5I787667IOYHU");
		client.setPays("tunis");
		client.setNomCl("ali");
		client.setRc("56/87954YTGYYJ");
		
		Client client5=new Client();
		client5.setAdresseCl("mednine");
		client5.setEmail("lquhgiu@hotmail.fr");
		client5.setFax(72456756);
		client5.setMf("H5I78754667");
		client5.setPays("tunisia");
		client5.setNomCl("zied");
		client5.setRc("56/879879Y");
		client5.setTel(75239879);
		clientRepository.save(client5);
		
		Client client4=new Client();
		client4.setAdresseCl("mednine");
		client4.setEmail("lqjzhef@hotmail.fr");
		client4.setFax(72476876);
		client4.setMf("H5I787667IOYHU");
		client4.setPays("tunis");
		client4.setNomCl("riadh");
		client4.setRc("56/87954YTGYYJ");
		
		Client client3=new Client();
		client3.setAdresseCl("mednine");
		client3.setEmail("lquhgiu@hotmail.fr");
		client3.setFax(72456756);
		client3.setMf("H5I78754667");
		client3.setPays("tunisia");
		client3.setNomCl("wassim");
		client3.setRc("56/879879Y");
		client3.setTel(75239879);
		clientRepository.save(client3);
		
		Client client2=new Client();
		client2.setAdresseCl("mednine");
		client2.setEmail("lqjzhef@hotmail.fr");
		client2.setFax(72476876);
		client2.setMf("H5I787667IOYHU");
		client2.setPays("tunis");
		client2.setNomCl("sofien");
		client2.setRc("56/87954YTGYYJ");
		
		client2.setTel(752356457);
		clientRepository.save(client2);
		
		Fournisseur fournisseur1=new Fournisseur();
		fournisseur1.setNom("youkyug");
		fournisseur1.setEmail("jhhjhj@gmail.com");
		fournisseur1.setAdresse("tunis");
		fournisseur1.setMF("HJH3456567K");
		fournisseur1.setRC("54/797876879");
		fournisseur1.setPays("tunisia");
		fournisseur1.setFax(756576467);
		fournisseur1.setTel(67578798);
		fournisseurRepository.save(fournisseur1);
		
		Fournisseur fournisseur4=new Fournisseur();
		fournisseur4.setNom("ali");
		fournisseur4.setEmail("jhhjhj@gmail.com");
		fournisseur4.setAdresse("tunis");
		fournisseur4.setMF("HJH3456567K");
		fournisseur4.setRC("54/797876879");
		fournisseur4.setPays("tunisia");
		fournisseur4.setFax(756576467);
		fournisseur4.setTel(67578798);
		fournisseurRepository.save(fournisseur4);
		
		Fournisseur fournisseur5=new Fournisseur();
		fournisseur5.setNom("rahim");
		fournisseur5.setEmail("jhhjhj@gmail.com");
		fournisseur5.setAdresse("tunis");
		fournisseur5.setMF("HJH3456567K");
		fournisseur5.setRC("54/797876879");
		fournisseur5.setPays("tunisia");
		fournisseur5.setFax(756576467);
		fournisseur5.setTel(67578798);
		fournisseurRepository.save(fournisseur5);
		
		Fournisseur fournisseur=new Fournisseur();
		fournisseur.setNom("azerty");
		fournisseur.setEmail("jhhjhj@gmail.fr");
		fournisseur.setAdresse("tunis");
		fournisseur.setMF("HJH3456567K");
		fournisseur.setRC("54/797876");
		fournisseur.setPays("tuni");
		fournisseur.setFax(7565467);
		fournisseur.setTel(678798);
		fournisseurRepository.save(fournisseur);
		
		
		Fournisseur fournisseur2=new Fournisseur();
		fournisseur2.setNom("mourad");
		fournisseur2.setEmail("jhhjhj@gmail.com");
		fournisseur2.setAdresse("tunis");
		fournisseur2.setMF("HJH3456567K");
		fournisseur2.setRC("54/797876879");
		fournisseur2.setPays("tunisia");
		fournisseur2.setFax(756576467);
		fournisseur2.setTel(67578798);
		fournisseurRepository.save(fournisseur2);
		
		
		StockBL stockFacture=new StockBL();
		stockFacture.setArticle(galaxy);
		stockFacture.setDateA("11/04/2014");
		stockFacture.setFodec(1);
		stockFacture.setFournisseur(fournisseur);
		stockFacture.setNbreboite(50);
		stockFacture.setNumfact(1);
		stockFacture.setPuht(50);
		stockFacture.setPuttc(60);
		stockFacture.setRemise(5);
		stockFacture.setRemiseboite(2);
		stockFacture.setTimbre(3);
		stockFacture.setTotal_ht(805);
		stockFacture.setTotal_ttc(987);
		stockFacture.setTva(18);
		stockFacture.setTvaboite(18);
		stockBLRepository.save(stockFacture);
		
		StockBL bl1=new StockBL();
		bl1.setArticle(ipad);
		bl1.setDateA("11/04/2013");
		bl1.setFodec(11);
		bl1.setFournisseur(fournisseur4);
		bl1.setNbreboite(34);
		bl1.setNumfact(15);
		bl1.setPuht(500);
		bl1.setPuttc(645);
		bl1.setRemise(25);
		bl1.setRemiseboite(23);
		bl1.setTimbre(3);
		bl1.setTotal_ht(854);
		bl1.setTotal_ttc(932);
		bl1.setTva(18);
		bl1.setTvaboite(18);
		stockBLRepository.save(bl1);
		
		StockBL stockF=new StockBL();
		stockF.setArticle(iphone);
		stockF.setDateA("16/03/2014");
		stockF.setFodec(1);
		stockF.setFournisseur(fournisseur2);
		stockF.setNbreboite(50);
		stockF.setNumfact(3);
		stockF.setPuht(50);
		stockF.setPuttc(546);
		stockF.setRemise(62);
		stockF.setRemiseboite(45);
		stockF.setTimbre(45);
		stockF.setTotal_ht(805);
		stockF.setTotal_ttc(987);
		stockF.setTva(18);
		stockF.setTvaboite(18);
		stockBLRepository.save(stockF);
		
		StockBL bl15=new StockBL();
		bl15.setArticle(ipad);
		bl15.setDateA("14/04/2012");
		bl15.setFodec(1);
		bl15.setFournisseur(fournisseur);
		bl15.setNbreboite(567);
		bl15.setNumfact(7);
		bl15.setPuht(345);
		bl15.setPuttc(56789);
		bl15.setRemise(234);
		bl15.setRemiseboite(345);
		bl15.setTimbre(3);
		bl15.setTotal_ht(23);
		bl15.setTotal_ttc(23457);
		bl15.setTva(2345);
		bl15.setTvaboite(23);
		stockBLRepository.save(bl15);
		
		
		
		StockBL bl25=new StockBL();
		bl25.setArticle(iphone);
		bl25.setDateA("11/04/2014");
		bl25.setFodec(1);
		bl25.setFournisseur(fournisseur);
		bl25.setNbreboite(50);
		bl25.setNumfact(5);
		bl25.setPuht(50);
		bl25.setPuttc(60);
		bl25.setRemise(5);
		bl25.setRemiseboite(2);
		bl25.setTimbre(3);
		bl25.setTotal_ht(805);
		bl25.setTotal_ttc(987);
		bl25.setTva(18);
		bl25.setTvaboite(18);
		stockBLRepository.save(bl25);
		
		StockFacture facture=new StockFacture();
		facture.setArticle(galaxy);
		facture.setDateA("11/04/2014");
		facture.setFodec(1);
		facture.setFournisseur(fournisseur);
		facture.setNbreboite(50);
		facture.setNumfact(2);
		facture.setPuht(50);
		facture.setPuttc(60);
		facture.setRemise(5);
		facture.setRemiseboite(2);
		facture.setTimbre(3);
		facture.setTotal_ht(805);
		facture.setTotal_ttc(987);
		facture.setTva(18);
		facture.setTvaboite(18);
		stockFactureRepository.save(facture);
		
		StockFacture facture1=new StockFacture();
		facture1.setArticle(xperia);
		facture1.setDateA("11/04/2012");
		facture1.setFodec(1);
		facture1.setFournisseur(fournisseur4);
		facture1.setNbreboite(34);
		facture1.setNumfact(17);
		facture1.setPuht(65);
		facture1.setPuttc(60);
		facture1.setRemise(5);
		facture1.setRemiseboite(2);
		facture1.setTimbre(3);
		facture1.setTotal_ht(805);
		facture1.setTotal_ttc(987);
		facture1.setTva(18);
		facture1.setTvaboite(18);
		stockFactureRepository.save(facture1);
		
		StockFacture facture3=new StockFacture();
		facture3.setArticle(xperia);
		facture3.setDateA("02/06/2014");
		facture3.setFodec(1);
		facture3.setFournisseur(fournisseur5);
		facture3.setNbreboite(45);
		facture3.setNumfact(1);
		facture3.setPuht(340);
		facture3.setPuttc(340);
		facture3.setRemise(56);
		facture3.setRemiseboite(213456);
		facture3.setTimbre(435);
		facture3.setTotal_ht(345);
		facture3.setTotal_ttc(3434);
		facture3.setTva(18);
		facture3.setTvaboite(18);
		stockFactureRepository.save(facture3);
		
		StockFacture facture5=new StockFacture();
		facture5.setArticle(xperia);
		facture5.setDateA("11/03/2013");
		facture5.setFodec(1);
		facture5.setFournisseur(fournisseur);
		facture5.setNbreboite(56);
		facture5.setNumfact(6);
		facture5.setPuht(345);
		facture5.setPuttc(345);
		facture5.setRemise(34);
		facture5.setRemiseboite(452);
		facture5.setTimbre(3);
		facture5.setTotal_ht(8045);
		facture5.setTotal_ttc(95487);
		facture5.setTva(18);
		facture5.setTvaboite(45);
		stockFactureRepository.save(facture5);
		
		StockNF nf=new StockNF();
		nf.setArticle(xperia);
		nf.setDateA("11/03/2013");
		nf.setPU(45);
		nf.setQuantite(345);
		nf.setTotal(345456);
		stockNFRepository.save(nf);
		
		StockNF nf1=new StockNF();
		nf1.setArticle(ipad);
		nf1.setDateA("01/04/2013");
		nf1.setPU(4567);
		nf1.setQuantite(33456);
		nf1.setTotal(348906);
		stockNFRepository.save(nf1);
		
		StockNF nf2=new StockNF();
		nf2.setArticle(iphone);
		nf2.setDateA("03/03/2014");
		nf2.setPU(4534);
		nf2.setQuantite(344565);
		nf2.setTotal(34545456);
		stockNFRepository.save(nf2);
		
		StockNF nf3=new StockNF();
		nf3.setArticle(galaxy);
		nf3.setDateA("112/12/2012");
		nf3.setPU(4345);
		nf3.setQuantite(34985);
		nf3.setTotal(345456);
		stockNFRepository.save(nf3);
		
	
		
		Facture facture2=new  Facture();
		List<Article> article2=new ArrayList<Article>();
		
		article2.add(ipad);
		facture2.setArticles(article2);
		facture2.setClient(client2);
		facture2.setDateF("12/11/2013");
		facture2.setNumFact(1);
		facture2.setRemise(5);
		facture2.setTotal_HTVA(1253);
		facture2.setTotal_TVA(1297);
		facture2.setTTTC(1311);
		factureRepository.save(facture2);
		

		
		

		
		Facture factur=new  Facture();
		List<Article> article=new ArrayList<Article>();
		
		article.add(ipad);
		factur.setArticles(article);
		factur.setClient(client3);
		factur.setDateF("12/6/2013");
		factur.setNumFact(2);
		factur.setRemise(5);
		factur.setTotal_HTVA(111);
		factur.setTotal_TVA(129);
		factur.setTTTC(141);
		factureRepository.save(factur);
		

		
		Facture facture4=new  Facture();
		List<Article> article6=new ArrayList<Article>();
		
		article6.add(xperia);
		facture4.setArticles(article6);
		facture4.setClient(client3);
		facture4.setDateF("12/07/2014");
		facture4.setNumFact(3);
		facture4.setRemise(45);
		facture4.setTotal_HTVA(1253);
		facture4.setTotal_TVA(1256);
		facture4.setTTTC(13456);
		factureRepository.save(facture4);
	
		Devis devis=new Devis();
		List<Article> article1=new ArrayList<Article>();
		
		article1.add(galaxy);
		devis.setArticles(article1);
		devis.setClient(client2);
		devis.setDateF("11/11/2011");
		devis.setNumDevis(1);
		devis.setRemise(50);
		devis.setTttc(700);
		devisRepository.save(devis);
		
		Devis devis1=new Devis();
		devis1.setArticles(article1);
		devis1.setClient(client3);
		devis1.setDateF("12/05/2014");
		devis1.setNumDevis(2);
		devis1.setRemise(50);
		devis1.setTttc(754);
		devisRepository.save(devis1);
		
		Devis devis2=new Devis();
		
		devis2.setArticles(article1);
		devis2.setClient(client3);
		devis2.setDateF("12/06/2012");
		devis2.setNumDevis(3);
		devis2.setRemise(45);
		devis2.setTttc(670);
		devisRepository.save(devis2);
		
		Devis devis3=new Devis();
		
		devis3.setArticles(article1);
		devis3.setClient(client2);
		devis3.setDateF("11/11/2013");
		devis3.setNumDevis(4);
		devis3.setRemise(69);
		devis3.setTttc(654);
		devisRepository.save(devis3);
		
		BonLivraison BL=new BonLivraison();
		List<Article> articles1=new ArrayList<Article>();
		
		article1.add(galaxy);
		BL.setArticles(articles1);
		BL.setQuantite(34);
		BL.setClient(client3);
		BL.setDateBL("12/07/2012");
		BL.setNumBL(1);
		BL.setTht(2345);
		bonLivraisonRepository.save(BL);
		
		
		
		BonLivraison BL1=new BonLivraison();
		
		BL1.setArticles(article1);
		BL1.setClient(client2);
		BL1.setQuantite(765);
		BL1.setDateBL("12/07/2014");
		BL1.setNumBL(2);
		BL1.setTht(655);
		bonLivraisonRepository.save(BL1);
		
        BonLivraison BL2=new BonLivraison();
		
		BL2.setArticles(articles1);
		BL2.setClient(client3);
		BL2.setQuantite(543);
		BL2.setDateBL("01/04/2014");
		BL2.setNumBL(3);
		BL2.setTht(8765);
		bonLivraisonRepository.save(BL2);
		
        BonLivraison BL3=new BonLivraison();
		
		BL3.setArticles(article1);
		BL3.setClient(client2);
		BL3.setQuantite(675);
		BL3.setDateBL("12/07/2014");
		BL3.setNumBL(4);
		BL3.setTht(545);
		bonLivraisonRepository.save(BL3);
		
        BonLivraison BL4=new BonLivraison();
		
		BL4.setArticles(article1);
		BL4.setClient(client3);
		BL4.setQuantite(3456);
		BL4.setDateBL("2/02/2014");
		BL4.setNumBL(5);
		BL4.setTht(5454);
		bonLivraisonRepository.save(BL4);
		
        BonLivraison BL5=new BonLivraison();
		
		BL5.setArticles(articles1);
		BL5.setClient(client2);
		BL.setQuantite(2345);
		BL5.setDateBL("28/05/2013");
		BL5.setNumBL(6);
		BL5.setTht(545678);
		bonLivraisonRepository.save(BL5);
		
		
	}
	
	
	
	
	
}
