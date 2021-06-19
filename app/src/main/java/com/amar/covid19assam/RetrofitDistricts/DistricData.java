package com.amar.covid19assam.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class DistricData {

    @SerializedName("Airport Quarantine")
    private Adilabad adilabad;
    @SerializedName("Baksa")
    private BhadradriKothagudem bhadradriKothagudem;
    @SerializedName("Barpeta")
    private Hyderabad hyderabad;
    @SerializedName("Biswanath")
    private Jagtial jagtial;
    @SerializedName("Bongaigaon")
    private Jangaon jangaon;
    @SerializedName("Cachar")
    private JayashankarBhupalapally jayashankarBhupalapally;
    @SerializedName("Charaideo")
    private JogulambaGadwal jogulambaGadwal;
    @SerializedName("Chirang")
    private Kamareddy kamareddy;
    @SerializedName("Darrang")
    private Karimnagar karimnagar;
    @SerializedName("Dhemaji")
    private Khammam khammam;
    @SerializedName("Dhubri")
    private KomaramBheem komaramBheem;
    @SerializedName("Dibrugarh")
    private Mahabubabad mahabubabad;
    @SerializedName("Dima Hasao")
    private Mahabubnagar mahabubnagar;
    @SerializedName("Goalpara")
    private Mancherial mancherial;
    @SerializedName("Golaghat")
    private Medak medak;
    @SerializedName("Hailakandi")
    private MedchalMalkajgiri medchalMalkajgiri;
    @SerializedName("Hojai")
    private Mulugu mulugu;
    @SerializedName("Jorhat")
    private Nagarkurnool nagarkurnool;
    @SerializedName("Kamrup")
    private Nalgonda nalgonda;
    @SerializedName("Kamrup Metropolitan")
    private Narayanpet narayanpet;
    @SerializedName("Karbi Anglong")
    private Nirmal nirmal;
    @SerializedName("Karimganj")
    private Nizamabad nizamabad;
    @SerializedName("Kokrajhar")
    private Peddapalli peddapalli;
    @SerializedName("Lakhimpur")
    private RajannaSircilla rajannaSircilla;
    @SerializedName("Majuli")
    private RangaReddy rangaReddy;
    @SerializedName("Morigaon")
    private Sangareddy sangareddy;
    @SerializedName("Nagaon")
    private Siddipet siddipet;
    @SerializedName("Nalbari")
    private Suryapet suryapet;
    @SerializedName("Sivasagar")
    private Vikarabad vikarabad;
    @SerializedName("Sonitpur")
    private WarangalUrban warangalUrban;
    @SerializedName("South Salmara Mankachar")
    private SouthSalmaraMankachar southSalmaraMankachar;
    @SerializedName("Tinsukia")
    private Tinsukia tinsukia;
    @SerializedName("Udalguri")
    private Udalguri udalguri;
    @SerializedName("West Karbi Anglong")
    private WestKarbiAnglong westKarbiAnglong;
    @SerializedName("Unknown")
    private Unknown unknown;

    public DistricData(Adilabad adilabad, BhadradriKothagudem bhadradriKothagudem, Hyderabad hyderabad, Jagtial jagtial, Jangaon jangaon, JayashankarBhupalapally jayashankarBhupalapally, JogulambaGadwal jogulambaGadwal, Kamareddy kamareddy, Karimnagar karimnagar, Khammam khammam, KomaramBheem komaramBheem, Mahabubabad mahabubabad, Mahabubnagar mahabubnagar, Mancherial mancherial, Medak medak, MedchalMalkajgiri medchalMalkajgiri, Mulugu mulugu, Nagarkurnool nagarkurnool, Nalgonda nalgonda, Narayanpet narayanpet, Nirmal nirmal, Nizamabad nizamabad, Peddapalli peddapalli, RajannaSircilla rajannaSircilla, RangaReddy rangaReddy, Sangareddy sangareddy, Siddipet siddipet, Suryapet suryapet, Vikarabad vikarabad, WarangalUrban warangalUrban, SouthSalmaraMankachar southSalmaraMankachar, Tinsukia tinsukia, Udalguri udalguri, WestKarbiAnglong westKarbiAnglong, Unknown unknown) {
        this.adilabad = adilabad;
        this.bhadradriKothagudem = bhadradriKothagudem;
        this.hyderabad = hyderabad;
        this.jagtial = jagtial;
        this.jangaon = jangaon;
        this.jayashankarBhupalapally = jayashankarBhupalapally;
        this.jogulambaGadwal = jogulambaGadwal;
        this.kamareddy = kamareddy;
        this.karimnagar = karimnagar;
        this.khammam = khammam;
        this.komaramBheem = komaramBheem;
        this.mahabubabad = mahabubabad;
        this.mahabubnagar = mahabubnagar;
        this.mancherial = mancherial;
        this.medak = medak;
        this.medchalMalkajgiri = medchalMalkajgiri;
        this.mulugu = mulugu;
        this.nagarkurnool = nagarkurnool;
        this.nalgonda = nalgonda;
        this.narayanpet = narayanpet;
        this.nirmal = nirmal;
        this.nizamabad = nizamabad;
        this.peddapalli = peddapalli;
        this.rajannaSircilla = rajannaSircilla;
        this.rangaReddy = rangaReddy;
        this.sangareddy = sangareddy;
        this.siddipet = siddipet;
        this.suryapet = suryapet;
        this.vikarabad = vikarabad;
        this.warangalUrban = warangalUrban;
        this.southSalmaraMankachar = southSalmaraMankachar;
        this.tinsukia = tinsukia;
        this.udalguri = udalguri;
        this.westKarbiAnglong = westKarbiAnglong;
        this.unknown = unknown;
    }

    public Adilabad getAdilabad() {
        return adilabad;
    }

    public void setAdilabad(Adilabad adilabad) {
        this.adilabad = adilabad;
    }

    public BhadradriKothagudem getBhadradriKothagudem() {
        return bhadradriKothagudem;
    }

    public void setBhadradriKothagudem(BhadradriKothagudem bhadradriKothagudem) {
        this.bhadradriKothagudem = bhadradriKothagudem;
    }

    public Hyderabad getHyderabad() {
        return hyderabad;
    }

    public void setHyderabad(Hyderabad hyderabad) {
        this.hyderabad = hyderabad;
    }

    public Jagtial getJagtial() {
        return jagtial;
    }

    public void setJagtial(Jagtial jagtial) {
        this.jagtial = jagtial;
    }

    public Jangaon getJangaon() {
        return jangaon;
    }

    public void setJangaon(Jangaon jangaon) {
        this.jangaon = jangaon;
    }

    public JayashankarBhupalapally getJayashankarBhupalapally() {
        return jayashankarBhupalapally;
    }

    public void setJayashankarBhupalapally(JayashankarBhupalapally jayashankarBhupalapally) {
        this.jayashankarBhupalapally = jayashankarBhupalapally;
    }

    public JogulambaGadwal getJogulambaGadwal() {
        return jogulambaGadwal;
    }

    public void setJogulambaGadwal(JogulambaGadwal jogulambaGadwal) {
        this.jogulambaGadwal = jogulambaGadwal;
    }

    public Kamareddy getKamareddy() {
        return kamareddy;
    }

    public void setKamareddy(Kamareddy kamareddy) {
        this.kamareddy = kamareddy;
    }

    public Karimnagar getKarimnagar() {
        return karimnagar;
    }

    public void setKarimnagar(Karimnagar karimnagar) {
        this.karimnagar = karimnagar;
    }

    public Khammam getKhammam() {
        return khammam;
    }

    public void setKhammam(Khammam khammam) {
        this.khammam = khammam;
    }

    public KomaramBheem getKomaramBheem() {
        return komaramBheem;
    }

    public void setKomaramBheem(KomaramBheem komaramBheem) {
        this.komaramBheem = komaramBheem;
    }

    public Mahabubabad getMahabubabad() {
        return mahabubabad;
    }

    public void setMahabubabad(Mahabubabad mahabubabad) {
        this.mahabubabad = mahabubabad;
    }

    public Mahabubnagar getMahabubnagar() {
        return mahabubnagar;
    }

    public void setMahabubnagar(Mahabubnagar mahabubnagar) {
        this.mahabubnagar = mahabubnagar;
    }

    public Mancherial getMancherial() {
        return mancherial;
    }

    public void setMancherial(Mancherial mancherial) {
        this.mancherial = mancherial;
    }

    public Medak getMedak() {
        return medak;
    }

    public void setMedak(Medak medak) {
        this.medak = medak;
    }

    public MedchalMalkajgiri getMedchalMalkajgiri() {
        return medchalMalkajgiri;
    }

    public void setMedchalMalkajgiri(MedchalMalkajgiri medchalMalkajgiri) {
        this.medchalMalkajgiri = medchalMalkajgiri;
    }

    public Mulugu getMulugu() {
        return mulugu;
    }

    public void setMulugu(Mulugu mulugu) {
        this.mulugu = mulugu;
    }

    public Nagarkurnool getNagarkurnool() {
        return nagarkurnool;
    }

    public void setNagarkurnool(Nagarkurnool nagarkurnool) {
        this.nagarkurnool = nagarkurnool;
    }

    public Nalgonda getNalgonda() {
        return nalgonda;
    }

    public void setNalgonda(Nalgonda nalgonda) {
        this.nalgonda = nalgonda;
    }

    public Narayanpet getNarayanpet() {
        return narayanpet;
    }

    public void setNarayanpet(Narayanpet narayanpet) {
        this.narayanpet = narayanpet;
    }

    public Nirmal getNirmal() {
        return nirmal;
    }

    public void setNirmal(Nirmal nirmal) {
        this.nirmal = nirmal;
    }

    public Nizamabad getNizamabad() {
        return nizamabad;
    }

    public void setNizamabad(Nizamabad nizamabad) {
        this.nizamabad = nizamabad;
    }

    public Peddapalli getPeddapalli() {
        return peddapalli;
    }

    public void setPeddapalli(Peddapalli peddapalli) {
        this.peddapalli = peddapalli;
    }

    public RajannaSircilla getRajannaSircilla() {
        return rajannaSircilla;
    }

    public void setRajannaSircilla(RajannaSircilla rajannaSircilla) {
        this.rajannaSircilla = rajannaSircilla;
    }

    public RangaReddy getRangaReddy() {
        return rangaReddy;
    }

    public void setRangaReddy(RangaReddy rangaReddy) {
        this.rangaReddy = rangaReddy;
    }

    public Sangareddy getSangareddy() {
        return sangareddy;
    }

    public void setSangareddy(Sangareddy sangareddy) {
        this.sangareddy = sangareddy;
    }

    public Siddipet getSiddipet() {
        return siddipet;
    }

    public void setSiddipet(Siddipet siddipet) {
        this.siddipet = siddipet;
    }

    public Suryapet getSuryapet() {
        return suryapet;
    }

    public void setSuryapet(Suryapet suryapet) {
        this.suryapet = suryapet;
    }

    public Vikarabad getVikarabad() {
        return vikarabad;
    }

    public void setVikarabad(Vikarabad vikarabad) {
        this.vikarabad = vikarabad;
    }

    public WarangalUrban getWarangalUrban() {
        return warangalUrban;
    }

    public void setWarangalUrban(WarangalUrban warangalUrban) {
        this.warangalUrban = warangalUrban;
    }

    public SouthSalmaraMankachar getSouthSalmaraMankachar() {
        return southSalmaraMankachar;
    }

    public void setSouthSalmaraMankachar(SouthSalmaraMankachar southSalmaraMankachar) {
        this.southSalmaraMankachar = southSalmaraMankachar;
    }

    public Tinsukia getTinsukia() {
        return tinsukia;
    }

    public void setTinsukia(Tinsukia tinsukia) {
        this.tinsukia = tinsukia;
    }

    public Udalguri getUdalguri() {
        return udalguri;
    }

    public void setUdalguri(Udalguri udalguri) {
        this.udalguri = udalguri;
    }

    public WestKarbiAnglong getWestKarbiAnglong() {
        return westKarbiAnglong;
    }

    public void setWestKarbiAnglong(WestKarbiAnglong westKarbiAnglong) {
        this.westKarbiAnglong = westKarbiAnglong;
    }

    public Unknown getUnknown() {
        return unknown;
    }

    public void setUnknown(Unknown unknown) {
        this.unknown = unknown;
    }
}
