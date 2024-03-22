package api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.*;
import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
public class SubscriptionManager {
    private static final String CSV_FILE_PATH = "src/main/java/DatabaseFiles/Subscription.csv";


    public static void saveSubscriptions(User user) {
        List<String[]> allRows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // Keep only rows that do not belong to the current user
                if (!nextLine[0].equals(user.getEmail())) {
                    allRows.add(nextLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        // Add the current user's subscriptions
        for (Subscription subscription : user.getSubscriptions()) {
            allRows.add(new String[]{user.getEmail(), subscription.getServiceName(), String.valueOf(subscription.isActive())});
        }

        // Rewrite the CSV with the updated data
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH))) {
            writer.writeAll(allRows);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static List<Subscription> loadSubscriptions(String username) {
        List<Subscription> subscriptions = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            List<String[]> allRows = reader.readAll();
            for (String[] row : allRows) {
                if (row[0].equals(username)) {
                    String serviceName = row[1];
                    boolean isActive = Boolean.parseBoolean(row[2]);
                    subscriptions.add(new Subscription(serviceName, isActive));
                }
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return subscriptions;
    }


    // Method to remove a subscription for a specific user
    public static void removeSubscription(String username, String serviceName) {
        List<String[]> allRows = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // Add all rows that don't match the user-service combination to be removed
                if (!(nextLine[0].equals(username) && nextLine[1].equals(serviceName))) {
                    allRows.add(nextLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        // Rewrite the CSV without the removed subscription
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE_PATH))) {
            writer.writeAll(allRows);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean subscriptionExists(String email, String selectedStation) {
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE_PATH))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine[0].equals(email) && nextLine[1].equals(selectedStation)) {
                    return true; // Found a matching row
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
        return false; // No matching row found
    }

}
