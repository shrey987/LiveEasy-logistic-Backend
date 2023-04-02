CREATE TABLE shipments (
  loadingPoint VARCHAR(255),
  unloadingPoint VARCHAR(255),
  productType VARCHAR(255),
  truckType VARCHAR(255),
  noOfTrucks INT,
  weight INT,
  comment VARCHAR(255),
  shipperId VARCHAR(255),
  Date DATE,
  PRIMARY KEY (shipperId)
);
