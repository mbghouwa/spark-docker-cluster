#!/bin/bash


spark-submit \
--class n7.projet.WordCountTask \
--master yarn \
--deploy-mode cluster \
--driver-memory 2g --driver-cores 1 \
--executor-memory 1g --executor-cores 1 \
wordcount.jar data/purchases.txt output



