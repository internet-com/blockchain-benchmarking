#!/usr/bin/env bash
#fabric
docker pull hyperledger/fabric-peer:latest;
docker pull hyperledger/fabric-membersrvc:latest;
cp root_init_files/* /home/ec2-user/
sudo chmod u+x e-voting;
export HOST_IP=${ROOT_NODE}; docker-compose up -d;

sleep 10

CORE_CHAINCODE_ID_NAME=mycc CORE_PEER_ADDRESS=0.0.0.0:7051 nohup ./e-voting >/dev/null 2>chaincode.log &
