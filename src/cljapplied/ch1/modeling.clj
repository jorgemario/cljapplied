(ns ch1.modeling)

(def earth {:name "Earth"
            :moons 1
            :volume 1.08321e12 ;; km^3
            :mass 5.97219e24 ;; kg
            :aphelion 152098232 ;; km, farthest from sun
            :perihelion 147098290;; km, closest to the sun
            :type :Planet ;; entity type
            })

(defrecord Planet [name
                   moons
                   volume
                   mass
                   aphelion
                   perihelion])

;; defrecord provides two factories:
;; Positional factory (->Name) More concise but the position is important.
;; Callers ar more likely to break if the record is changed.
(def earth2 (->Planet "Earth" 1 1.0e12 5.9e24 152 147))

;; Map Factory (map->Name) Expects a map with keyed values:
(def earth3 (map->Planet {:name "Earth"}))

;; Records define their type by creating a Java class with a field
;; for each attribyute.



