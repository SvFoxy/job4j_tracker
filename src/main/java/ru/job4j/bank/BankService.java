package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает главный сервис
 */
public class BankService {
    /**
     * Map содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему
     * @param user пользователь, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод позволит удалить пользователя из системы
     * @param passport паспорт пользователя, который нужно удалить
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод должен добавить новый счет к пользователю:
     * @param passport паспорт пользователя
     * @param account счет, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = getAccounts(user);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    /**
     *  Метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта, по которому выполняется поиск
     * @return возвращает пользователя или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам:
     * @param passport номер паспорта
     * @param requisite реквизиты счета
     * @return - возвращает счет или null, если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = getAccounts(user);
            for (Account account : acc) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт.
     *
     * @param sourcePassport номер счета, с которого переводят деньги
     * @param sourceRequisite реквизиты счета, с которого переводят деньги
     * @param destinationPassport номер счета, на который переводят деньги
     * @param destinationRequisite реквизиты счета, на который переводят деньги
     * @param amount - сумма перевода
     * @return возвращает true, если деньги переведены,
     *                  и false, если счёт не найден или не хватает денег на счёте sourcePassport (с которого переводят)
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account accountSource = findByRequisite(sourcePassport, sourceRequisite);
        Account accountDestination = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSource != null && accountDestination != null) {
            if (Double.compare(accountSource.getBalance(), amount) >= 0) {
                accountSource.setBalance(accountSource.getBalance() - amount);
                accountDestination.setBalance(accountDestination.getBalance() + amount);
                result = true;
                }
        }
        return result;
    }

    /**
     * Метод предназначен для поиска всех счетов пользователя
     * @param user пользователь, который добавляется в систему
     * @return возвращает список всех счетов клиента типа List
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}