
package com.workshop.Entity;


import java.time.LocalDate;

import com.workshop.Repo.Trip;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class roundTrip implements Trip{
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String sourceState;
	    private String sourceCity;
	    private String destinationState;
	    private String destinationCity;
	    private int hatchback;
	    private int sedan;
	    private int sedanpremium;
	    private int suv;
	    private int suvplus;
		private int ertiga;
	    private String status;

		private LocalDate startDate;
    private LocalDate endDate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSourceState() {
			return sourceState;
		}
		public void setSourceState(String sourceState) {
			this.sourceState = sourceState;
		}
		public String getSourceCity() {
			return sourceCity;
		}
		public void setSourceCity(String sourceCity) {
			this.sourceCity = sourceCity;
		}
		public String getDestinationState() {
			return destinationState;
		}
		public void setDestinationState(String destinationState) {
			this.destinationState = destinationState;
		}
		public String getDestinationCity() {
			return destinationCity;
		}
		public void setDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
		}
		public int getHatchback() {
			return hatchback;
		}
		public void setHatchback(int hatchback) {
			this.hatchback = hatchback;
		}
		public int getSedan() {
			return sedan;
		}
		public void setSedan(int sedan) {
			this.sedan = sedan;
		}
		public int getSedanpremium() {
			return sedanpremium;
		}
		public void setSedanpremium(int sedanpremium) {
			this.sedanpremium = sedanpremium;
		}
		public int getSuv() {
			return suv;
		}
		public void setSuv(int suv) {
			this.suv = suv;
		}
		public int getSuvplus() {
			return suvplus;
		}
		public void setSuvplus(int suvplus) {
			this.suvplus = suvplus;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

		
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		
		public roundTrip(Long id, String sourceState, String sourceCity, String destinationState,
				String destinationCity, int hatchback, int sedan, int sedanpremium, int suv, int suvplus, int ertiga, String  status, LocalDate startDate, LocalDate endDate) {
			super();
			this.id = id;
			this.sourceState = sourceState;
			this.sourceCity = sourceCity;
			this.destinationState = destinationState;
			this.destinationCity = destinationCity;
			this.hatchback = hatchback;
			this.sedan = sedan;
			this.sedanpremium = sedanpremium;
			this.suv = suv;
			this.suvplus = suvplus;
			this.status = status;
			this.startDate=startDate;
			this.endDate=endDate;
		}
		public roundTrip() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "roundTrip [id=" + id + ", sourceState=" + sourceState + ", sourceCity=" + sourceCity
					+ ", destinationState=" + destinationState + ", destinationCity=" + destinationCity + ", hatchback="
					+ hatchback + ", sedan=" + sedan + ", sedanpremium=" + sedanpremium + ", suv=" + suv + ", suvplus="
					+ suvplus + ", status=" + status + "]";
		}
		public int getErtiga() {
			return ertiga;
		}
		public void setErtiga(int ertiga) {
			this.ertiga = ertiga;
		}
		
	    
	    
	    

}
