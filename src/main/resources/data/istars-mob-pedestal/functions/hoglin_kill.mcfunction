scoreboard objectives add hoglin_kills dummy

scoreboard players add @s hoglin_kills 1

advancement revoke @s only istars-mob-pedestal:hoglin_kill

execute as @s if score @s hoglin_kills matches 50.. run give @s istars-mob-pedestal:hoglin_soul 1

execute as @s if score @s hoglin_kills matches 50.. run scoreboard players set @s hoglin_kills 0