# active-mq


#) INSTRUCTIONS

# ---------------------------------------------------------------------------------------------------------------

#) Run the following CURL to publish message: 

curl --location --request POST 'http://localhost:8080/amq/publishMessage' \
--header 'Content-Type: application/json' \
--data-raw '{
"source" : "D" ,
"message" : "4"
}'


# ---------------------------------------------------------------------------------------------------------------

#) You can change the values from application.properties by following VMOptions:
 -DAMQ_QUEUE_NAME=testQueue12



# ---------------------------------------------------------------------------------------------------------------


