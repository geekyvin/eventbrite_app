(ns eventbrite-app.sample-get
  (:gen-class)
  (:require [clj-http.client :as client]))

(def BASE-URI "https://www.eventbriteapi.com")

(def TOKEN "MA4FXSTQSWCFLFW7PT6Z")

(def USER "188321361932")

;;Sample get method
(client/get (format "%s/v3/users/%s?token=%s" BASE-URI USER TOKEN) {:accept :json})
